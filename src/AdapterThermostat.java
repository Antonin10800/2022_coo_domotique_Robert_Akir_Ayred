import thermos.Thermostat;

public class AdapterThermostat extends Thermostat implements Appareils{
    private Thermostat th;
   public AdapterThermostat(Thermostat t){
       this.th=t;
   }
   public void allumer(){
       this.th.monterTemperature();
   } ;
    public void eteindre(){
        this.th.baisserTemperature();
    };

    public boolean isAllumer(){
        return (true);
    };

}
