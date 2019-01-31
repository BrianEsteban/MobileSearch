/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Estudiante
 */
public class CellPhone 
{
    private String company;
    private String processor;
    private int RAM; 
    private int ROM;
    private int camera;
    private double batery;
    private double cost;
    private String AsocietedPlan;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBatery() {
        return batery;
    }

    public void setBatery(double batery) {
        this.batery = batery;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAsocietedPlan() {
        return AsocietedPlan;
    }

    public void setAsocietedPlan(String AsocietedPlan) {
        this.AsocietedPlan = AsocietedPlan;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "company=" + company + ", processor=" + processor + ", RAM=" + RAM + ", ROM=" + ROM + ", camera=" + camera + ", batery=" + batery + ", cost=" + cost + ", AsocietedPlan=" + AsocietedPlan + '}';
    }
    
    
}
