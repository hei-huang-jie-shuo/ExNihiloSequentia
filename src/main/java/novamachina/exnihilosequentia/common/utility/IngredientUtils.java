package novamachina.exnihilosequentia.common.utility;

import net.minecraft.item.crafting.Ingredient;
import org.apache.logging.log4j.LogManager;

import javax.annotation.Nonnull;
import java.util.Arrays;

public class IngredientUtils {
    @Nonnull private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    private IngredientUtils() {
    }

    public static boolean areIngredientsEqual(@Nonnull final Ingredient i1, @Nonnull final Ingredient i2) {
        @Nonnull final String item1;
        @Nonnull final String item2;
        try {
            item1 = Arrays.toString(i1.getItems());
            item2 = Arrays.toString(i2.getItems());
        } catch (Exception e) {
            logger.debug("Cannot compare ingredients");
            logger.debug("Ingredient 1: " + Arrays.toString(i1.getItems()));
            logger.debug("Ingredient 2: " + Arrays.toString(i2.getItems()));
            logger.debug(e.getMessage());
            return false;
        }

        return item1.equals(item2);
    }
}
