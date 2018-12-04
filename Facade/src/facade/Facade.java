/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Arrays;

/**
 *
 * @author juhos
 */
public class Facade {

  
    
}
class CPU {
    public void freeze() { 
        System.out.println("Freezed.");
    }
    public void jump(long position) {
        System.out.println("Jumping to POS:" + position);
    }
    public void execute() { 
        System.out.println("Excecuting code");
    }
}

class HardDrive {
    public byte[] read(long lba, int size) { 
        
        byte[] bytes = new byte[2];
        long lng = lba;
        System.out.println("BOOT Sector at POS:"+lng);
        int amount = size;
        System.out.println("BOOT Sector size is:"+amount);
        bytes[0] = (byte)amount;
        bytes[1] = (byte)lng;
        
        return bytes;
    }
}

class Memory {
    public void load(long position, byte[] data) { 
        char data1 = (char)data[0];
        char data2 = (char)data[1];
        System.out.println("Loading from urrent position: " + position + " with data: " + data1 + data2);
    }
}

/* Facade */

class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        long BOOT_ADDRESS = 0x02;
        long BOOT_SECTOR = 1337;
        int SECTOR_SIZE = 128;
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

/* Client */

