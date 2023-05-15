package com.deeps;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MenuServiceImpl implements MenuService {

	private final MenuRepo menuRepo;

	@Inject
	public MenuServiceImpl(MenuRepo menuRepo) {
		this.menuRepo = menuRepo;
	}

	@Override
	@Transactional
	public Menu saveMenu(Menu menu) {
		menuRepo.persistAndFlush(menu);
		return menu;
	}

	@Override
	public Menu getMenuById(long id) {

		return menuRepo.findById(id);
	}

	@Override
	public List<Menu> getAllMenus() {

		return menuRepo.listAll();
	}

	@Override
	@Transactional
	public Menu updateMenu(long id, Menu menu) {

		Menu existingMenu = getMenuById(id);
		existingMenu.setMenuName(menu.getMenuName());
		existingMenu.setCuisine(menu.getCuisine());
		menuRepo.persist(existingMenu);
		return existingMenu;
	}

	@Override
	@Transactional
	public void deleteMenu(long id) {
		menuRepo.deleteById(id);
		System.out.println("______________Control reaches deletion___________");
	}

}
