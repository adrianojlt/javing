package pt.adrz.samples.patterns.builder;

public class NutritionFacts {

    private NutritionFacts(Builder builder) {
        int carbohydrate = builder.carbohydrate;
        int servingSize = builder.servingSize;
        int servings = builder.servings;
        int calories = builder.calories;
        int sodium = builder.sodium;
        int fat = builder.fat;
    }

    public static class Builder {

        // required parameters
        private final int servingSize;
        private final int servings;

        // optional
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
