package le;

/**
 *
 * @author Phuc Hong Le
 */
public class CreditCardC {
    private long number;
    private String name;

    public CreditCardC(long number, String name) {
        this.number = number;
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.number ^ (this.number >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CreditCardC other = (CreditCardC) obj;
        if (this.number != other.number) {
            return false;
        }
        return true;
    }
    
    
}
