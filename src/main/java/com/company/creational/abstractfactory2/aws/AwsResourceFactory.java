package com.company.creational.abstractfactory2.aws;

import com.company.creational.abstractfactory2.Instance;
import com.company.creational.abstractfactory2.ResourceFactory;
import com.company.creational.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}