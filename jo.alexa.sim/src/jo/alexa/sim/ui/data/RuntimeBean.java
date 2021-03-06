package jo.alexa.sim.ui.data;

import java.util.ArrayList;
import java.util.List;

import jo.alexa.sim.data.ApplicationBean;
import jo.alexa.sim.data.PCSBean;

public class RuntimeBean extends PCSBean
{
    private boolean         mDisclaimerAccepted;
    private ApplicationBean mApp;
    private List<TransactionBean>   mHistory;
    private List<ScriptTransactionBean>   mScript;
    private TransactionRenderOpsBean    mRenderOps;
    private List<AppSpecBean> mMRUs;

    public RuntimeBean()
    {
        mApp = new ApplicationBean();
        mHistory = new ArrayList<TransactionBean>();
        mRenderOps = new TransactionRenderOpsBean();
        mScript = new ArrayList<ScriptTransactionBean>();
    }
    
    public ApplicationBean getApp()
    {
        return mApp;
    }

    public void setApp(ApplicationBean app)
    {
        ApplicationBean _app = mApp;
        mApp = app;
        mPCS.firePropertyChange("app", _app, mApp);
    }

    public boolean isDisclaimerAccepted()
    {
        return mDisclaimerAccepted;
    }

    public void setDisclaimerAccepted(boolean disclaimerAccepted)
    {
        boolean _disclaimerAccepted = mDisclaimerAccepted;
        mDisclaimerAccepted = disclaimerAccepted;
        mPCS.firePropertyChange("disclaimerAccepted", _disclaimerAccepted, mDisclaimerAccepted);
    }

    public List<TransactionBean> getHistory()
    {
        return mHistory;
    }

    public void setHistory(List<TransactionBean> history)
    {
        mHistory = history;
    }

    public TransactionRenderOpsBean getRenderOps()
    {
        return mRenderOps;
    }

    public void setRenderOps(TransactionRenderOpsBean renderOps)
    {
        mRenderOps = renderOps;
    }

    public List<AppSpecBean> getMRUs()
    {
        return mMRUs;
    }

    public void setMRUs(List<AppSpecBean> mRUs)
    {
        mMRUs = mRUs;
    }

    public List<ScriptTransactionBean> getScript()
    {
        return mScript;
    }

    public void setScript(List<ScriptTransactionBean> script)
    {
        mScript = script;
    }
}
