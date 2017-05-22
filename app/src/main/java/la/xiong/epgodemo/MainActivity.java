package la.xiong.epgodemo;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import la.xiong.mylibrary.EasyPermissions;

public class MainActivity extends AppCompatActivity implements EasyPermissions.PermissionWithDialogCallbacks{

    private static final int RC_LOCATION_PERM = 100;
    private static final int RC_SETTINGS_SCREEN = 101;
    String[] perms = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION//位置
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyPermissions.requestPermissions(this, 1, RC_LOCATION_PERM, perms);
    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {

    }

    @Override
    public void onDialog(int requestCode, int dialogType, final EasyPermissions.DialogCallback callback) {
        //可以根据dialogType选择不同的自定义对话框显示
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(MainActivity.this);
        normalDialog.setMessage("运行缺少必须的权限");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callback.onGranted();
                    }
                });
        normalDialog.setNegativeButton("关闭",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        // 显示
        normalDialog.show();
    }
}
