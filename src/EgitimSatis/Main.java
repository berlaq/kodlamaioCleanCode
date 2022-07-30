package EgitimSatis;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EgitimService egitimManager = new EgitimManager(new EfEgitimDal(),new StandartPriceCampaingManager());
        for (Egitim egitim: egitimManager.getEgitim()) {
            System.out.println(egitim.getName() + " "+ egitim.getPrice());
        }

    }

}

class  Egitim implements Entity{
    private int id;
    private String name;
    private double price;

    public Egitim(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class EgitimManager implements EgitimService{

    EgitimDao egitimDao;
    CampaingService campaingService;

    public EgitimManager(EgitimDao egitimDao, CampaingService campaingService) {
        this.egitimDao = egitimDao;
        this.campaingService = campaingService;
    }

    @Override
    public List<Egitim> getEgitim() {
        var egitimler = egitimDao.getEgitim();
        campaingService.updatePrice(egitimler);
        return egitimler;
    }

}

interface Entity{ }


interface EgitimService{
    List<Egitim> getEgitim();
}

interface EgitimDao{
    List<Egitim> getEgitim();
}

class EfEgitimDal implements EgitimDao{

    @Override
    public List<Egitim> getEgitim(){

        return Arrays.asList(
                new Egitim(1,"CS Kursu",150),
                new Egitim(2,"Java Kursu",250),
                new Egitim(3,"React Kursu",50));
    }
}

interface CampaingService{
    void updatePrice(List<Egitim> egitimler);
}

class StandartPriceCampaingManager implements CampaingService{

    @Override
    public void updatePrice(List<Egitim> egitimler) {
            for (Egitim egitim: egitimler) {
                egitim.setPrice(getCurrentPrice());
            }
    }
    private double getCurrentPrice() {
        return 25;
    }
}

class PercentageDiscountCampaingManager implements CampaingService{

    @Override
    public void updatePrice(List<Egitim> egitimler) {
            for (Egitim egitim: egitimler) {
                egitim.setPrice(egitim.getPrice()-egitim.getPrice()*getPercentageDiscount());
            }
    }
    private double getPercentageDiscount() {
        return 0.10;
    }
}

















