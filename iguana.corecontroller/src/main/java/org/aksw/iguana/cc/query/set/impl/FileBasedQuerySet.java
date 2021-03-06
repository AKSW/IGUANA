package org.aksw.iguana.cc.query.set.impl;

import org.aksw.iguana.cc.query.set.QuerySet;
import org.aksw.iguana.cc.utils.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * File based query set
 */
public class FileBasedQuerySet implements QuerySet {

    private File queryFile;
    private int size=0;



    public  FileBasedQuerySet(File queryFile) throws IOException {
        this.queryFile=queryFile;
        size=FileUtils.countLines(queryFile);
    }

    public File getFile(){
        return queryFile;
    }

    @Override
    public String getQueryAtPos(int pos) throws IOException {
        return FileUtils.readLineAt(pos, queryFile);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getName() {
        return queryFile.getName();
    }

    @Override
    public String getContent() throws IOException {
        return org.apache.commons.io.FileUtils.readFileToString(queryFile, "UTF-8");
    }


}
