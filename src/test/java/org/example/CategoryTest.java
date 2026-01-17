package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    @Test
    void shouldStoreCategoryData() {

        Category category = new Category("Jedzenie", CategoryType.FOOD);

        assertEquals("Jedzenie", category.getName());
        assertEquals(CategoryType.FOOD, category.getType());
    }
}