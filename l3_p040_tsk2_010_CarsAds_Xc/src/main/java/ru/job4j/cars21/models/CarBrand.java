package ru.job4j.cars21.models;

public class CarBrand {

   private int id;
   private String name;

   public CarBrand() {
   }

   public CarBrand(int id) {
      this.id = id;
   }

   public CarBrand(int id, String name) {
      this.id = id;
   this.name = name;
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
}
