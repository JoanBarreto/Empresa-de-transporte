public class EmpresaTransporte
{
    private Camion camion1;
    private Camion camion2;
    private Camion camion3;
    private Camion camion4;

    public EmpresaTransporte( )
    {
        camion1 = new Camion( "BAC213", 150, 85.0 );
        camion2 = new Camion( "CAP384", 190, 70.0 );
        camion3 = new Camion( "GER273", 280, 100.0 );
        camion4 = new Camion( "JKV232", 215, 110.0 );

    }
    public Camion getCamion1( )
    {
        return camion1;
    }
    public Camion getCamion2( )
    {
        return camion2;
    }
    public Camion getCamion3( )
    {
        return camion3;
    }
    public Camion getCamion4( )
    {
        return camion4;
    }
    public Boolean cargarCamion( String matricula, Integer pesoCarga )
    {
        Boolean cargo = false;
        if( camion1.getMatricula( ).equals( matricula ) )
        {
            cargo = camion1.cargar( pesoCarga );
        }
        else if( camion2.getMatricula( ).equals( matricula ) )
        {
            cargo = camion2.cargar( pesoCarga );
        }
        else if( camion3.getMatricula( ).equals( matricula ) )
        {
            cargo = camion3.cargar( pesoCarga );
        }
        else if( camion4.getMatricula( ).equals( matricula ) )
        {
            cargo = camion4.cargar( pesoCarga );
        }
        return cargo;
    }
    public void descargarCamion( String matricula )
    {
        if( camion1.getMatricula( ).equals( matricula ) )
        {
            camion1.descargar( );
        }
        else if( camion2.getMatricula( ).equals( matricula ) )
        {
            camion2.descargar( );
        }
        else if( camion3.getMatricula( ).equals( matricula ) )
        {
            camion3.descargar( );
        }
        else if( camion4.getMatricula( ).equals( matricula ) )
        {
            camion4.descargar( );
        }
    }
    public Integer getCapacidadTotal( )
    {
        return camion1.getCapacidad( ) + camion2.getCapacidad( ) + camion3.getCapacidad( ) + camion4.getCapacidad( );
    }
    public Integer getCargaTotal( )
    {
        return camion1.getCargaActual( ) + camion2.getCargaActual( ) + camion3.getCargaActual( ) + camion4.getCargaActual( );
    }
    public Double calcularCargaPromedio( )
    {
        Double promedio = ( double ) ( getCargaTotal( ) / 4 );
        return promedio;
    }
    
    public Camion getMejorCamion( Integer pesoCarga )
    {
        Camion mejor = null;
        if( (camion1.getCapacidad( ) >= pesoCarga) && ((camion1.getConsumo( ) < camion2.getConsumo())||(camion1.getConsumo( ) < camion3.getConsumo()) || (camion1.getConsumo( ) < camion4.getConsumo())) )
        {
            mejor = camion1;
        }
        if( (camion2.getCapacidad( ) >= pesoCarga) && ((camion2.getConsumo( ) < camion1.getConsumo()) ||(camion2.getConsumo( ) < camion3.getConsumo()) || (camion2.getConsumo( ) < camion4.getConsumo())) )
        {
            mejor = camion2;
        }
        if( (camion3.getCapacidad( ) >= pesoCarga) && ((camion3.getConsumo( ) < camion1.getConsumo()) ||(camion3.getConsumo( ) < camion2.getConsumo()) || (camion3.getConsumo( ) < camion4.getConsumo())) )
        {
            mejor = camion3;
        }
        if( (camion4.getCapacidad( ) >= pesoCarga) && ((camion4.getConsumo( ) < camion1.getConsumo()) ||(camion4.getConsumo( ) < camion2.getConsumo()) || (camion4.getConsumo( ) < camion3.getConsumo())) )
        {
            mejor = camion4;
        }
        
  
        return mejor;
  
    }
    public String metodo1( )
    {
        return "Respuesta 1.";
    }
    public String metodo2( )
    {
        return "Respuesta 2.";
    }
}
