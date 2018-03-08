package gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class GuiSavannaPedia extends GuiScreen {

	  private final int bookImageHeight = 288;
	  private final int bookImageWidth = 400;
	  private int currPage = 0;
	  private static final int bookTotalPages = 13;
	  private static ResourceLocation[] bookPageTextures = new ResourceLocation[13];
	  private static ResourceLocation bookPageButtonTextures = new ResourceLocation("wildanimals:textures/gui/book.png");
	  private static String[] stringPageText = new String[14];
	  private GuiButton buttonDone;
	  private NextPageButton buttonNextPage;
	  private NextPageButton buttonPreviousPage;
	private int offTop;
	private int offLeft;
	  
	
    public GuiSavannaPedia() {
        bookPageTextures[0] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book.png");
        bookPageTextures[1] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/tbc.png");
        bookPageTextures[2] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book0.png");
        bookPageTextures[3] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book1.png");
        bookPageTextures[4] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book2.png");
        bookPageTextures[5] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book3.png");
        bookPageTextures[6] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book4.png");
        bookPageTextures[7] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book5.png");
        bookPageTextures[8] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book6.png");
        bookPageTextures[9] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book7.png");
        bookPageTextures[10] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book8.png");
        bookPageTextures[11] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book9.png");
        bookPageTextures[12] = new ResourceLocation("wildanimals:textures/gui/AnimalBook/book10.png");

        
        stringPageText[0] = "";
        stringPageText[1] = "";
        stringPageText[2] = "";
        stringPageText[3] = "";
        stringPageText[4] = "";
        
        stringPageText[5] = "";
        stringPageText[6] = "";
        stringPageText[7] = "";
        stringPageText[8] = "";
        stringPageText[9] = "";
        stringPageText[10] = "";
        stringPageText[11] = "";
        stringPageText[12] = "";
      }
  
      @Override
      public void initGui() 
      {
       // DEBUG
       System.out.println("GuiShadowmarks initGUI()");
          buttonList.clear();
          Keyboard.enableRepeatEvents(true);

          buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight, 
                98, 20, I18n.format("gui.done", new Object[0]));
    
          buttonList.add(buttonDone);
          int offsetFromScreenLeft = (width - bookImageWidth) / 2;
          buttonList.add(buttonNextPage = new NextPageButton(1, 
                offsetFromScreenLeft + 120, 156, true));
          buttonList.add(buttonPreviousPage = new NextPageButton(2, 
                offsetFromScreenLeft + 38, 156, false));
      }

 
      @Override
      public void updateScreen() 
      {
          buttonDone.visible = (currPage == bookTotalPages - 1);
          buttonNextPage.visible = (currPage < bookTotalPages - 1);
          buttonPreviousPage.visible = currPage > 0;
      }
   
     
      @Override
      public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
      {
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          if (currPage == 0)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[0]);
          }
          else if (currPage == 1)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[1]);
          }
          else if (currPage == 2)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[2]);
          } 
          else if (currPage == 3)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[3]);
          } 
          else if (currPage == 4)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[4]);
          } 
          else if (currPage == 5)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[5]);
          } 
          else if (currPage == 6)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[6]);
          } 
          else if (currPage == 7)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[7]);
          } 
          else if (currPage == 8)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[8]);
          } 
          else if (currPage == 9)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[9]);
          } 
          else if (currPage == 10)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[10]);
          } 
          else if (currPage == 11)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[11]);
          }
           if (currPage == 12)
          {
           mc.getTextureManager().bindTexture(bookPageTextures[12]);
          }
         
          int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
          this.drawModalRectWithCustomSizedTexture(offLeft, offTop, 0, 0, bookImageWidth,bookImageHeight - 90,bookImageWidth,bookImageHeight);
          int widthOfString;
          		String stringPageIndicator = I18n.format("book.pageIndicator", new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});

          widthOfString = fontRendererObj.getStringWidth(stringPageIndicator);
          fontRendererObj.drawString(stringPageIndicator, offsetFromScreenLeft - widthOfString + bookImageWidth - 44, 18, 0);
          fontRendererObj.drawSplitString(stringPageText[currPage], offsetFromScreenLeft + 36, 34, 116, 0);
          super.drawScreen(parWidth, parHeight, p_73863_3_);


         
      }

      @Override
      protected void mouseClickMove(int parMouseX, int parMouseY, 
            int parLastButtonClicked, long parTimeSinceMouseClick) 
      {
       
      }

      @Override
      protected void actionPerformed(GuiButton parButton) 
      {
       if (parButton == buttonDone)
       {
           mc.displayGuiScreen((GuiScreen)null);
       }
          else if (parButton == buttonNextPage)
          {
              if (currPage < bookTotalPages - 1)
              {
                  ++currPage;
              }
          }
          else if (parButton == buttonPreviousPage)
          {
              if (currPage > 0)
              {
                  --currPage;
              }
          }
     }

      @Override
      public void onGuiClosed() 
      {
       
      }
      @Override
      public boolean doesGuiPauseGame()
      {
          return true;
      }
      
      @SideOnly(Side.CLIENT)
      static class NextPageButton extends GuiButton
      {
          private final boolean isNextButton;

          public NextPageButton(int parButtonId, int parPosX, int parPosY, 
                boolean parIsNextButton)
          {
              super(parButtonId, parPosX, parPosY, 23, 13, "");
              isNextButton = parIsNextButton;
          }

          @Override
          public void drawButton(Minecraft mc, int parX, int parY)
          {
              if (visible)
              {
                  boolean isButtonPressed = (parX >= xPosition 
                        && parY >= yPosition 
                        && parX < xPosition + width 
                        && parY < yPosition + height);
                  mc.getTextureManager().bindTexture(bookPageButtonTextures);
                  int textureX = 0;
                  int textureY = 256;

                  if (isButtonPressed)
                  {
                      textureX += 23;
                  }

                  if (!isNextButton)
                  {
                      textureY += 13;
                  }

                  drawTexturedModalRect(xPosition, yPosition, 
                        textureX, textureY, 
                        23, 13);
              }
          }
      }
  }