package com.how2code.designpattern.abstractfactorypattern.factory;

import com.how2code.designpattern.abstractfactorypattern.entity.file.FileType;
import com.how2code.designpattern.abstractfactorypattern.entity.file.IFile;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.IFolder;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.SystemFolder;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.UserFolder;

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
