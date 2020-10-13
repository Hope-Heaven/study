using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2
{
    public partial class Form1 : Form
    {
        public Form1()

        {

            //Форма
            InitializeComponent();
            Text = "Стартовое состояние формы";
            this.BackColor = Color.White;
            this.Width = 450;
            this.Height = 450;
        }

        private void Label1_Click(object sender, EventArgs e)
        {
            
        }

        private void GroupBox1_Enter(object sender, EventArgs e)
        {
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void RadioButton1_MouseClick(object sender, MouseEventArgs e)
        {
            groupBox1.Visible = true;
        }

        private void RadioButton2_CheckedChanged(object sender, EventArgs e)
        {
            button2.Visible = true;
        }

        private void ComboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Button2_Click(object sender, EventArgs e)
        {
            
            Form2 newForm = new Form2();
            newForm.Show();
            //.Close();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            Form3 newForm = new Form3();
            newForm.Show();
            
           // Form1 newForm1 = new Form1();
           // newForm.Close();
        }
    }
}
