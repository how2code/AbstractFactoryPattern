package com.how2code.designpattern.abstractfactorypattern.entity.file;

public class XlsFile implements IFile {
	
	@Override
	public void getPath() {
		System.out.println("C:\\DIR1\\FILE.XLS");
	}

}
