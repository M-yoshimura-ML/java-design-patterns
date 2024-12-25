package com.company.creational.abstractfactory2.gcp;

import com.company.creational.abstractfactory2.Instance;
import com.company.creational.abstractfactory2.ResourceFactory;
import com.company.creational.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
