Examples
--------
.. only:: html
   
    .. code::

        >>> f = g.graphx_triangle_count(output_property = "triangle_count", output_graph_name = "tc_graph")

.. only:: latex
   
    .. code::

        >>> f = g.graphx_triangle_count(output_property = "triangle_count",
        ... output_graph_name = "tc_graph")

The expected output is like this:

.. code::

    {u'label1': Frame "None"
    row_count = 110
    schema =
      _vid:int64
      _label:unicode
      max_k:int64
      cc:int64
      TC:int32
      node:unicode,
    u'label2': Frame "None"
    row_count = 430
    schema =
      _vid:int64
      _label:unicode
      max_k:int64
      cc:int64
      TC:int32
      node:unicode}


To query:

.. only:: html

    .. code::

        >>> frame_for_label1 = f['label1']
        >>> frame_for_label1.inspect(10)
        
          _vid:int64   _label:unicode   max_k:int64   cc:int64   TC:int32   node:unicode
        /--------------------------------------------------------------------------------/
              106656   label1                     2         12          0   node158
              129504   label1                     3         23          1   node2116
               86640   label1                     7         17         15   node183
               20424   label1                     7         47         15   node4248
              164184   label1                     2         72          0   node7388
               23232   label1                     9         39         28   node3210
               93840   label1                     3         83          1   node8446
              114480   label1                     8         58         21   node5311
               48480   label1                    10         30         36   node2166
               31152   label1                     6         96         10   node9516


.. only:: latex

    .. code::

        >>> frame_for_label1 = f['label1']
        >>> frame_for_label1.inspect(10)

           _vid   _label   max_k  cc     TC     node
           int64  unicode  int64  int64  int32  unicode
        /------------------------------------------------\
          106656  label1       2     12      0  node158
          129504  label1       3     23      1  node2116
           86640  label1       7     17     15  node183
           20424  label1       7     47     15  node4248
          164184  label1       2     72      0  node7388
           23232  label1       9     39     28  node3210
           93840  label1       3     83      1  node8446
          114480  label1       8     58     21  node5311
           48480  label1      10     30     36  node2166
           31152  label1       6     96     10  node9516


