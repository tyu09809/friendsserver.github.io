package net.megatkc.aeon.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiScreen;

public class InGameGUI extends GuiScreen {
	
	public InGameGUI() {
		renderScreen();
	}
	
	public void renderScreen() {
		String client_name = "Aeon b1";
		drawRect(2, 2, 120, 14, 0x50000000);
		fontRenderer.drawString(client_name, 4, 4, 0xffffffff);
	}

	
}
