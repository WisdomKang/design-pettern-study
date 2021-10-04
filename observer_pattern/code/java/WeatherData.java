package observer_pattern.code.java;

import java.util.ArrayList;

//주체를 구현해보자 
public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void notifyObservers() {
        for( Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if ( index >= 0 ) {
            observers.remove(index);        
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements( float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
    
}
