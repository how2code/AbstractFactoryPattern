package com.how2code.designpattern.abstractfactorypattern.factory;

import com.how2code.designpattern.abstractfactorypattern.entity.file.DocFile;
import com.how2code.designpattern.abstractfactorypattern.entity.file.FileType;
import com.how2code.designpattern.abstractfactorypattern.entity.file.IFile;
import com.how2code.designpattern.abstractfactorypattern.entity.file.XlsFile;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.IFolder;

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
