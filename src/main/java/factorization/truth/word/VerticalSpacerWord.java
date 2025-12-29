package factorization.truth.word;

import net.minecraft.client.gui.FontRenderer;

import factorization.truth.api.IHtmlTypesetter;

public class VerticalSpacerWord extends Word {

    final int vertSize;

    public VerticalSpacerWord(int vertSize) {
        this.vertSize = vertSize;
    }

    @Override
    public int getWidth(FontRenderer font) {
        return 0;
    }

    @Override
    public int draw(int x, int y, boolean hover, FontRenderer font) {
        return 0;
    }

    @Override
    public int getPaddingAbove() {
        return 0;
    }

    @Override
    public int getWordHeight() {
        return vertSize;
    }

    @Override
    public void writeHtml(IHtmlTypesetter out) {
        // Nada
    }
}
