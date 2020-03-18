public class Camion
{
    private String matricula;
    private Integer capacidad;
    private Double consumo;
    private Integer cargaActual;
    
    public Camion( String matricula, Integer capacidad, Double consumo )
    {
        this.matricula =matricula;
        this.capacidad = capacidad;
        this.consumo = consumo;
        cargaActual = 0;
    }
    public String getMatricula( ){return matricula;}
    public Integer getCapacidad( ){return capacidad;}
    public Double getConsumo( ){return consumo;}
   
    public Integer getCargaActual( ){return cargaActual;}
    public Boolean cargar( Integer pesoCarga )
    {
        Boolean cargo = false;
        if( pesoCarga <= capacidad )
        {
            cargo = true;
            cargaActual = pesoCarga;
        }
        return cargo;
    }
    public void descargar( )
    {
        cargaActual = 0;
    }

}
