package equalsHashCode.oneDigitalInnovation;

public class Carros {
    
    String marca;

    public String getMarca() { //gerar getters and setters
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public Carros(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() { //gerar hashCodes e equals
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carros other = (Carros) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

    
    
}
