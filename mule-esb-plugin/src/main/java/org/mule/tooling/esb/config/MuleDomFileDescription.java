package org.mule.tooling.esb.config;


import com.intellij.openapi.module.Module;
import com.intellij.openapi.util.Iconable;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomFileDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mule.tooling.esb.config.model.Mule;
import org.mule.tooling.esb.util.MuleIcons;
import org.mule.tooling.esb.util.MuleConfigUtils;

import javax.swing.*;

public class MuleDomFileDescription extends DomFileDescription<Mule> {
    public MuleDomFileDescription() {
        super(Mule.class, "mule", "http://www.mulesoft.org/schema/mule/core");
    }

    @Override
    public boolean isMyFile(@NotNull XmlFile file, @Nullable Module module) {
        return MuleConfigUtils.isMuleFile(file) && !MuleConfigUtils.isMUnitFile(file);

    }

    @Nullable
    public Icon getFileIcon(@Iconable.IconFlags int flags) {
        return MuleIcons.MuleFileType;
    }

    @Override
    protected void initializeFileDescription() {
        super.initializeFileDescription();
    }
}
