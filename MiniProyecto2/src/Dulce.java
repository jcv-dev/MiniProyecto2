
class Dulce {
    
    private String nombreDulce;
    private TipoDulce tipoDulce;
    private byte porcentajeGrasa;
    private boolean excesoSodio, excesoAzucar, excesoSaturadas, excesoTrans, contieneEdulcorantes;
    private Marca marca;

    public Dulce() {
        
    }

    public Dulce(String nombreDulce, TipoDulce tipoDulce, byte porcentajeGrasa, boolean excesoSodio, boolean excesoAzucar, boolean excesoSaturadas, boolean excesoTrans, boolean contieneEdulcorantes, Marca marca) {
        this.nombreDulce = nombreDulce;
        this.tipoDulce = tipoDulce;
        this.porcentajeGrasa = porcentajeGrasa;
        this.excesoSodio = excesoSodio;
        this.excesoAzucar = excesoAzucar;
        this.excesoSaturadas = excesoSaturadas;
        this.excesoTrans = excesoTrans;
        this.contieneEdulcorantes = contieneEdulcorantes;
        this.marca = marca;
    }
    
    public String getEtiquetas(){
        String etiquetas = "";
        
        if(excesoSodio == true){
            etiquetas += "Sodio. ";
        }
        if(excesoAzucar == true){
            etiquetas += "Azucar. ";
        }
        if(excesoSaturadas == true){
            etiquetas += "Saturadas. ";
        }
        if(excesoTrans == true){
            etiquetas += "Trans. ";
        }
        if(contieneEdulcorantes == true){
            etiquetas += "Edulcorantes. ";
        }
        
        return etiquetas;
    }

    public String getMarca() {
        
        String marcaString = "";
        if(null != marca)switch (marca) {
            case COLOMBINA:
                marcaString = "Colombina";
                break;
            case NESTLE:
                marcaString = "Nestle";
                break;
            case FRITOLAY:
                marcaString = "FritoLay";
                break;
            case POSTOBON:
                marcaString = "Postobon";
                break;
            default:
                break;
        }
        
        return marcaString;
    }

    public String getNombreDulce() {
        return nombreDulce;
    }

    public byte getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public String getTipoDulce() {
        
        String tipoString = "";
        
        switch(tipoDulce){
            
            case DULCE:
                tipoString = "Dulce";
                break;
            case ACIDO:
                tipoString = "Acido";
                break;
            case SIN_AZUCAR:
                tipoString = "Sin Azucar";
                break;
        }
        return tipoString;
    }

    public void setNombreDulce(String nombreDulce) {
        this.nombreDulce = nombreDulce;
    }

    public void setTipoDulce(TipoDulce tipoDulce) {
        this.tipoDulce = tipoDulce;
    }
    
    public void setEtiquetas(boolean sodio, boolean azucar, boolean saturadas, boolean trans, boolean edulcorantes){
        
        this.excesoSodio = sodio;
        this.excesoAzucar = azucar;
        this.excesoSaturadas = saturadas;
        this.excesoTrans = trans;
        this.contieneEdulcorantes = edulcorantes;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setPorcentajeGrasa(byte porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }
    
    
    
 

    
    

}