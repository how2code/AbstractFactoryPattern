package com.how2code.designpattern.abstractfactory.factory;

import com.how2code.designpattern.abstractfactory.entity.file.DocFile;
import com.how2code.designpattern.abstractfactory.entity.file.FileType;
import com.how2code.designpattern.abstractfactory.entity.file.IFile;
import com.how2code.designpattern.abstractfactory.entity.file.XlsFile;
import com.how2code.designpattern.abstractfactory.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactory.entity.folder.IFolder;

public class FileFactory extends FileSystemFactory{

	@Override
	public IFile getFile(FileType type) {
		if(type == FileType.DOC) {
			return new DocFile();
		} else if(type == FileType.XLS) {
			return new XlsFile();
		}
		return null;
	}

	@Override
	public IFolder getFolder(FolderType type) {
		return null;
	}

}
