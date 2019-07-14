package ru.job4j.tsk3_example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hobby", schema = "public", catalog = "cars01")
public class HobbyEntity {
   private String hobbyId;

   @Id
   @Column(name = "hobby_id")
   public String getHobbyId() {
      return hobbyId;
   }

   public void setHobbyId(String hobbyId) {
      this.hobbyId = hobbyId;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      HobbyEntity that = (HobbyEntity) o;

      if (hobbyId != null ? !hobbyId.equals(that.hobbyId) : that.hobbyId != null) return false;

      return true;
   }

   @Override
   public int hashCode() {
      return hobbyId != null ? hobbyId.hashCode() : 0;
   }
}
