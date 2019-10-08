package com.magazzino.utilities;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class ImageScaler {
	

	
	public static Image getScaledImage(ImageIcon srcImg, double percentage){
		
		int width = srcImg.getIconWidth();
		int height = srcImg.getIconHeight();
		
		int w = (int)(width * percentage / 100);
		int h = (int)(height * percentage / 100);
		
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();
	    Image newImage =srcImg.getImage();
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(newImage, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}

}
