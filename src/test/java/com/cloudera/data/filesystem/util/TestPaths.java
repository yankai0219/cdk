package com.cloudera.data.filesystem.util;

import java.io.File;

import org.apache.hadoop.fs.Path;
import org.junit.Assert;
import org.junit.Test;

import com.cloudera.data.filesystem.util.Paths;

public class TestPaths {

  @Test
  public void testToFile() {
    Path path = new Path(".");

    File asFile = Paths.toFile(path);

    Assert.assertEquals("Path name matches file name", path.getName(),
        asFile.getName());
  }

}