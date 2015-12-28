package com.how2code.designpattern.abstractfactorypattern.factory;

public class FileSystemProducer {
	public static FileSystemFactory getFileSystemFactory(FileSystemEntityType type) {
		if(type == FileSystemEntityType.FILE) {
			return new FileFactory();
		} else if(type == FileSystemEntityType.FOLDER) {
			return new FolderFactory();
		}
		return null;
	}
}
