package net.kenro.ji.jin.purescript.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import net.kenro.ji.jin.purescript.PSLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PSFile extends PsiFileBase {
    public PSFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PSFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Purescript File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
