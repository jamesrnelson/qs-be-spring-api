package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="meal_foods")
public class MealFoods {

      //fields
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int Id;

      //mappings
      @ManyToOne
      @JoinColumn(name="food_id")
      private Food food;

      @ManyToOne
      @JoinColumn(name="meal_id")
      private Meal meal;

}
