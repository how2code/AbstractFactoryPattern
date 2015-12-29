package com.how2code.designpattern.abstractfactory;

import com.how2code.designpattern.abstractfactory.entity.file.FileType;
import com.how2code.designpattern.abstractfactory.entity.file.IFile;
import com.how2code.designpattern.abstractfactory.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactory.entity.folder.IFolder;
import com.how2code.designpattern.abstractfactory.factory.FileSystemEntityType;
import com.how2code.designpattern.abstractfactory.factory.FileSystemFactory;
import com.how2code.designpattern.abstractfactory.factory.FileSystemProducer;

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
