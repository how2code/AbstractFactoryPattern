package com.how2code.designpattern.abstractfactorypattern.factory;

import com.how2code.designpattern.abstractfactorypattern.entity.file.FileType;
import com.how2code.designpattern.abstractfactorypattern.entity.file.IFile;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactorypattern.entity.folder.IFolder;

public abstract class FileSystemFactory {
	public abstract IFile getFile(FileType type);
	public abstract IFolder getFolder(FolderType type);
}
