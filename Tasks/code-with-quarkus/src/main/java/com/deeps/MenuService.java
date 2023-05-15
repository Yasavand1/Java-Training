package com.deeps;

import java.util.List;

public interface MenuService {
	Menu getMenuById(long id);

    List<Menu> getAllMenus();

    Menu updateMenu(long id, Menu user);

    Menu saveMenu(Menu menu);

    void deleteMenu(long id);
}
