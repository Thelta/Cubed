package com.jme3.cubed;

import com.jme3.cubed.math.Vector2i;

public class BlockSkin {
    private Vector2i[] textureLocations;
    private boolean isTransparent;
    
    public BlockSkin(Vector2i textureLocation, boolean isTransparent) {
        this(new Vector2i[] { textureLocation }, isTransparent);
    }
    
    public BlockSkin(Vector2i[] textureLocations, boolean isTransparent) {
        this.textureLocations = textureLocations;
        this.isTransparent = isTransparent;
    }
    
    public Vector2i getTextureLocation(Face face) {
        return textureLocations[getTextureLocationIndex(face)];
    }

    protected int getTextureLocationIndex(Face face) {
        if(textureLocations.length == 6) {
            return face.ordinal();
        }
        return 0;
    }

    public boolean isTransparent(){
        return isTransparent;
    }
}