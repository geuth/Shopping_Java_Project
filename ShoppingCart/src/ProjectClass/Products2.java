package FinalProject;
import java.util.Objects;
public class Products2 {
	private int pid;
	private String name;
	private double price;
    private int stock;
    
    public Products2 (int pid, String name, double price, int stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getName() {
	        return name;
	    }

    public void setName(String name) {
	        this.name = name;
	    }

	    public Double getPrice() {
	        return price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }

	    public Integer getStock() {
	        return stock;
	    }

	    public void setStock(Integer stock) {
	        this.stock = stock;
	    }

	    public Integer getPid() {
	        return pid;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 29 * hash + Objects.hashCode(this.pid);
	        hash = 29 * hash + Objects.hashCode(this.name);
	        hash = 29 * hash + Objects.hashCode(this.price);
	        hash = 29 * hash + Objects.hashCode(this.stock);
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
	        final Products2 other = (Products2) obj;
	        if (!Objects.equals(this.name, other.name)) {
	            return false;
	        }
	        if (!Objects.equals(this.pid, other.pid)) {
	            return false;
	        }
	        if (!Objects.equals(this.price, other.price)) {
	            return false;
	        }
	        if (!Objects.equals(this.stock, other.stock)) {
	            return false;
	        }
	        return true;
	    }

	    public void setPid(Integer pid) {
	        this.pid = pid;
	    }   
}
