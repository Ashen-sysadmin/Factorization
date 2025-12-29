package factorization.truth.cmd;

import net.minecraft.util.EnumChatFormatting;

import factorization.truth.api.*;

public class CmdTitle implements ITypesetCommand {

    static final String title_format = "" + EnumChatFormatting.UNDERLINE + EnumChatFormatting.BOLD;

    @Override
    public void callClient(IClientTypesetter out, ITokenizer tokenizer) throws TruthError {
        String val = tokenizer.getParameter("No content");
        out.write(val, null, title_format);
    }

    @Override
    public void callHTML(IHtmlTypesetter out, ITokenizer tokenizer) throws TruthError {
        out.html("\n\n<h1>");
        String val = tokenizer.getParameter("title text");
        out.write(val);
        out.html("</h1>\n");
    }
}
