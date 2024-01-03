package Practice;

import java.time.LocalDate;

public class Address {
    private String flat;
    private String district;
    private LocalDate updatedDate;

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public LocalDate getUpdatedDate() {
         return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flat='" + flat + '\'' +
                ", district='" + district + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}

