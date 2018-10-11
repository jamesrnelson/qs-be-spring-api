package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "food")
public class Food {

      //fields
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int Id;

      private String name;
      private int calories;

      //mappings

      @OneToMany(mappedBy="mealFoods")

      //sets and gets
      public String getName() {
              return name;
      }

      public void setName(String name) {
              this.name = name;
      }

      public int getCalories() {
              return calories;
      }

      public void setCalories(Int calories) {
              this.calories = calories;
      }
}
