package com.how2code.designpattern.abstractfactory.factory;

import com.how2code.designpattern.abstractfactory.entity.file.FileType;
import com.how2code.designpattern.abstractfactory.entity.file.IFile;
import com.how2code.designpattern.abstractfactory.entity.folder.FolderType;
import com.how2code.designpattern.abstractfactory.entity.folder.IFolder;

public abstract class FileSystemFactory {
	public abstract IFile getFile(FileType type);
	public abstract IFolder getFolder(FolderType type);
}
