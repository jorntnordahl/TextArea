package test.smartgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TextAreaItemTest implements EntryPoint
{
  /**
   * This is the entry point method.
   */
  @Override
  public void onModuleLoad()
  {
    TextAreaItem textAreaItem = new TextAreaItem();
    textAreaItem.setTitle("TextArea"); //$NON-NLS-1$

    DynamicForm df = new DynamicForm();
    df.setFields(textAreaItem);

    VLayout mainLayout = new VLayout();
    mainLayout.addMember(df);

    RootPanel.get().add(mainLayout);
  }
}
