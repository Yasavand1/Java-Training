package statedp;

interface TrafficState {
    void SignalOn(Signal signal);
    void SignalOff(Signal signal);
}

class Signal {
    private TrafficState state;
    
    public Signal() {
        state = new OfffState();
    }
    
    public void settrafficState(TrafficState state) {
        this.state = state;
    }
    
    public void SignalOn() {
        state.SignalOn(this);
    }
    
    public void SignalOff() {
        state.SignalOff(this);
    }
}

class OnnState implements TrafficState {
    @Override
    public void SignalOn(Signal signal) {
        System.out.println("Red Signal On");
    }
    
    @Override
    public void SignalOff(Signal signal) {
        System.out.println("Red Signal Off and turned to Green: Ready to move");
        signal.settrafficState(new OfffState());
    }
}

class OfffState implements TrafficState {
    @Override
    public void SignalOn(Signal signal) {
        System.out.println("Red Signal On");
        signal.settrafficState(new OnnState());
    }
    
    @Override
    public void SignalOff(Signal signal) {
        System.out.println("Red Signal is already off and vehicles are moving");
    }
}

public class StateExampleSignal {
    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.SignalOn();
        signal.SignalOff();
        signal.SignalOff();
        signal.SignalOn();
        signal.SignalOff();
    }
}
