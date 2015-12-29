package com.how2code.designpattern.abstractfactory.factory;

import com.how2code.designpattern.abstractfactory.entity.file.FileType;
import com.how2code.designpattern.abstractfactory.entity.file.IFile;
import com.how2code.designpattern.abstractfactory.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactory.entity.folder.IFolder;
import com.how2code.designpattern.abstractfactory.entity.folder.SystemFolder;
import com.how2code.designpattern.abstractfactory.entity.folder.UserFolder;

public class FolderFactory extends FileSystemFactory {

	@Override
	public IFile getFile(FileType type) {
		return null;
	}

	@Override
	public IFolder getFolder(FolderType type) {
		if(type == FolderType.SYSTEM) {
			return new SystemFolder();
		} else if(type == FolderType.USER) {
			return new UserFolder();
		}
		return null;
	}

}
