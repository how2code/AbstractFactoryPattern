package com.how2code.designpattern.abstractfactorypattern;

import com.how2code.designpattern.abstractfactorypattern.entity.file.FileType;
import com.how2code.designpattern.abstractfactorypattern.entity.file.IFile;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.IFolder;
import com.how2code.designpattern.abstractfactorypattern.factory.FileSystemEntityType;
import com.how2code.designpattern.abstractfactorypattern.factory.FileSystemFactory;
import com.how2code.designpattern.abstractfactorypattern.factory.FileSystemProducer;

public class Main {

	public static void main(String[] args) {
		FileSystemFactory fileFactory = FileSystemProducer.getFileSystemFactory(FileSystemEntityType.FILE);
		IFile file = fileFactory.getFile(FileType.DOC);
		file.getPath();
		
		file = fileFactory.getFile(FileType.XLS);
		file.getPath();
		
		FileSystemFactory folderFactory = FileSystemProducer.getFileSystemFactory(FileSystemEntityType.FOLDER);
		IFolder folder = folderFactory.getFolder(FolderType.SYSTEM);
		System.out.println(folder.getChildCount());
		
		folder = folderFactory.getFolder(FolderType.USER);
		System.out.println(folder.getChildCount());
	}

}
