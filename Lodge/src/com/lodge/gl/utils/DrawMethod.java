package com.lodge.gl.utils;
import android.opengl.GLES30;

public class DrawMethod {

	
	public enum Method{
		ELEMENTS,
		ELEMENTS_INSTANCED,
	}
	
	public static void Draw(Settings settings,VAO vao){
		switch(settings.mDrawMethod){
		
		case ELEMENTS:
			GLES30.glDrawElements(GLES30.GL_TRIANGLES, vao.indexCount(), GLES30.GL_UNSIGNED_SHORT, 0);
			break;
			
		case ELEMENTS_INSTANCED:
			GLES30.glDrawElementsInstanced(GLES30.GL_TRIANGLES, vao.indexCount(), GLES30.GL_UNSIGNED_SHORT, 0,vao.numInstances());
			break;
			
		}
		
	}
	
	
}
