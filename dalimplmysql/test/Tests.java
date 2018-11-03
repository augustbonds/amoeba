package com.augustbonds.dalimplmysql;

import io.hops.DalDriver;
import io.hops.DalStorageFactory;
import io.hops.StorageConnector;
import io.hops.exception.StorageInitializtionException;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class Tests {
    @Test
    public void testSomething(){
        System.out.println("boo");
    }

    @Test
    public void testLoadDriver() {
        try {
            DalStorageFactory storageFactory = DalDriver.load("com.augustbonds.dalimplmysql.dalimplmysql.DalStorageFactoryMysql");
        } catch (StorageInitializtionException e) {
            fail("Loading mysql driver caused exception: " + e.getMessage());
        }
    }

    @Test
    public void testLoadDriverGetConnector() {
        try {
            DalStorageFactory storageFactory = DalDriver.load("com.augustbonds.dalimplmysql.dalimplmysql.DalStorageFactoryMysql");
            Properties conf = new Properties();
            storageFactory.setConfiguration(conf);
            StorageConnector connector = storageFactory.getConnector();

            assertNotNull("StorageFactory returned null connector", connector);
        } catch (StorageInitializtionException e) {
            fail("Loading mysql driver caused exception: " + e.getMessage());
        }
    }
}
