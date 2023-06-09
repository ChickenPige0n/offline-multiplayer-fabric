package chickenpigeon.offlinemultiplayer.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ExampleMixin {
	@Inject(at = @At("RETURN"), method = "isMultiplayerEnabled",cancellable = true)
	private void injected_multiplayer(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
	@Inject(at = @At("RETURN"), method = "isOnlineChatEnabled",cancellable = true)
	private void injected_chat(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
