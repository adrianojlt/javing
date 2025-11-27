package pt.adrz.patterns.builder;

import org.junit.jupiter.api.Test;
import pt.adrz.samples.patterns.builder.NutritionFacts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NutritionFactsTests {

    @Test
    public void InstantiationTests() {

       var cocaCola = new NutritionFacts.Builder(240, 8)
               .calories(100)
               .fat(10)
               .sodium(34)
               .carbohydrate(28)
               .build();

       var pepsi = new NutritionFacts.Builder(100,50).build();

       assertNotNull(cocaCola);
       assertNotNull(pepsi);
    }
}
