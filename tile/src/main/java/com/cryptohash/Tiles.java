package com.cryptohash;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;

import java.io.IOException;

public class Tiles {
    public static void main(String[] args) throws InterruptedException, IOException, IM4JavaException {

        Tiles tiles = new Tiles();
/*        File file = new File("/home/nilesh.chordia/Downloads/image/ll.jpg");
        System.out.println(file);
        Info imageInfo = new Info(file.getPath(),true);
        System.out.println(imageInfo);*/
        tiles.resizeImages("source","destination");
    }
    public void resizeImages(String source,String dest) throws InterruptedException, IOException, IM4JavaException {
        // create command
        ConvertCmd cmd = new ConvertCmd();

        // create the operation, add images and operators/options
        IMOperation op = new IMOperation();
        op.addImage(source);
        op.resize(100,100);
        op.addImage(dest);
        cmd.run(op);
/*
        for (String srcImage:pImageNames) {
            int lastDot = srcImage.lastIndexOf('.');
            String dstImage = srcImage.substring(1,lastDot-1)+"_small.jpg";
            cmd.run(op,srcImage,dstImage);
        }*/
    }
}
