package relunidirecional.many_to_many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notebook {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String serialNumber;
    private int ramMemoryTotal;
    private int hdSpaceTotal;
    
       public int getId() {
             return id;
       }
       public void setId(int id) {
             this.id = id;
       }
       public String getSerialNumber() {
             return serialNumber;
       }
       public void setSerialNumber(String serialNumber) {
             this.serialNumber = serialNumber;
       }
       public int getRamMemoryTotal() {
             return ramMemoryTotal;
       }
       public void setRamMemoryTotal(int ramMemoryTotal) {
             this.ramMemoryTotal = ramMemoryTotal;
       }
       public int getHdSpaceTotal() {
             return hdSpaceTotal;
       }
       public void setHdSpaceTotal(int hdSpaceTotal) {
             this.hdSpaceTotal = hdSpaceTotal;
       }

}
