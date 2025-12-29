package factorization.truth.cmd;

import java.util.ArrayList;

import factorization.truth.ClientTypesetter;
import factorization.truth.WordPage;
import factorization.truth.api.*;

public class CmdSegStart implements ITypesetCommand {

    @Override
    public void callClient(IClientTypesetter out, ITokenizer tokenizer) throws TruthError {
        ArrayList<ArrayList<IWord>> lines = ((WordPage) out.getCurrentPage()).text;
        if (!lines.isEmpty()) {
            ((ClientTypesetter) out).segmentStart = lines.get(lines.size() - 1);
        }
    }

    @Override
    public void callHTML(IHtmlTypesetter out, ITokenizer tokenizer) throws TruthError {
        // NOP
    }
}
